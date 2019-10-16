# com.ada.stockexchange.domain.Stock Exchange

We're going to create an multi-module Maven stock exchange application.
- Note: this is an advanced codelab...

1. Create 1 parent project and 4 modules:
    - `api`
    - `service`
    - `domain`
    - `interfaces`
2. Think about the base-package each module should have.
3. Make sure that in the end (after implementing all the requirements), 
command `mvn clean package` executes successfully.
    - It should compile your code
    - It should compile **and run your tests**
        - Run tests using the Maven Surefire plugin: https://maven.apache.org/surefire/maven-surefire-plugin/
    - It should package your code into an (executable) JAR.
    
## A Breakdown of the modules (Requirements)

### Module: api
- Has a `com.ada.stockexchange.api.StockExchangeController` class
    - has method `com.ada.stockexchange.api.StockDto getStock(String stockId)`
        - calls the com.ada.stockexchange.service.StockService method `com.ada.stockexchange.domain.Stock getStock(String stockId)`
        - transforms com.ada.stockexchange.domain.Stock to com.ada.stockexchange.api.StockDto which it returns
            - *What is a Dto? Why do we use it?*
    - *(For the sake of this exercise, just imagine that this method can get called outside of this application, by other applications. 
    It's an entry point to our application, to get information about a stock)*

### Module: service
- Has a `com.ada.stockexchange.service.StockService` class
    - Has method `public com.ada.stockexchange.domain.Stock getStock(String stockId)`
        - calls the com.ada.stockexchange.domain.StockRepository method `com.ada.stockexchange.domain.Stock getStockInformation(String stockId)`
            - *What if no com.ada.stockexchange.domain.Stock could be found for the given stockId? 
            The method needs to return a com.ada.stockexchange.domain.Stock, so what will we return?*
        - enriches the com.ada.stockexchange.domain.Stock with Price information, 
        retrieved by calling the com.ada.stockexchange.interfaces.ExternalStockInformationService method `BigDecimal getPriceInEuroForStock(String stockId)`
        - returns the enriched com.ada.stockexchange.domain.Stock

### Module: domain
- Has a `com.ada.stockexchange.domain.Stock` class
    - Has the following state:
        - `id` (String)
        - `name` (String)
        - `price` (com.ada.stockexchange.domain.StockPrice)
    - Allow to set the price after construction (service has to enrich with price)
- Has a `com.ada.stockexchange.domain.StockPrice` class
    - Has the following state:
        - `price` (BigDecimal)
            - *Why BigDecimal and not float or double?*
        - `currency` (com.ada.stockexchange.domain.StockCurrency)
- Has a `com.ada.stockexchange.domain.StockCurrency` enum
    - Has enum-values EUR, USD & GBP
    - We should also provide a label (E.g.: "Euro") and symbol (E.g.: "€")
- Has a `com.ada.stockexchange.domain.StockRepository`
    - It holds a map (our fake Database) 
        - Contains <String, com.ada.stockexchange.domain.Stock> key-value pairs, where String is the stockId
            - Populate it with some fake data, e.g.: `("AA", new com.ada.stockexchange.domain.Stock("AA", "Ambro AN"))`
    - Has method `com.ada.stockexchange.domain.Stock getStockInformation(String stockId)`
        - Returns the corresponding com.ada.stockexchange.domain.Stock, based on stockId
        - throws an exception when no com.ada.stockexchange.domain.Stock was found in the database (map) for the specified stockId

### Module: interfaces
- Has a `com.ada.stockexchange.interfaces.ExternalStockInformationService` class
    - Has method `BigDecimal getPriceInEuroForStock(String stockId)`
        - Simply returns a random BigDecimal between 10 and 100, whatever the stockId is.
    - *(For the sake of this exercise, just imagine that this method calls an external service that has live data on the price of a stock. 
    This class and method function as the interface / access-point to that external service / system.)*         

## Extra Requirements (Not optional)
1. For building your Database (map), use the `ImmutableMap.builder` methods of library `Guava`
2. For generating a random number in `com.ada.stockexchange.interfaces.ExternalStockInformationService`, use the `RandomUtils` class from library `Commons-lang3`

## Extra Requirements (Optional, although recommended)
1. Command line interface
    1. Create a new module, name it `cli`
    2. Inside, create a class `com.ada.stockexchange.cli.MyCLI` that has a main method
        - The main method can have 0 or 1 arguments (located in String[] args), which should be a stockId
        - The main method calls the `com.ada.stockexchange.api.StockDto getStock(String stockId)` method from `com.ada.stockexchange.api.StockExchangeController` (api) 
        if it has 1 argument
        - The main method prints the answer (com.ada.stockexchange.api.StockDto)
    3. Create a JAR that packages module cli and all its dependencies
        - Use the assembly plugin
        - Specify the com.ada.stockexchange.cli.MyCLI main method as thé main method of the JAR
    4. Run the jar, providing it a stockId as an argument

## Tips    
- If you think it is helpful, use UML (class diagram(s), sequence diagram(s)) to make things more clear.
- Create multiple folders at once using the `mkdir` command. E.g.: `mkdir src\main\java`
- Explore what the "Maven Wrapper" is, use it if you like
    - *What are the benefits of the Maven Wrapper?*
    
## Finished?

Think you're finished? Ask for some feedback first, only then checkout the solution.
**Do yourself a favor and do not look at the solution beforehand!**
 
The `maven-stock-exchange` project on our GitHub project contains a solution for this codelab.
- Clone (or Fork, then Clone) the project: https://github.com/switchfully/maven-stock-exchange
- Explore the project
- Run the build: `mvn clean package`
    - Which module gets compiled first? Why?
    - Inspect the target folders, what do you notice?
    - Inspect the generated jars.
- You're free to experiment, make changes, extend,... the code
