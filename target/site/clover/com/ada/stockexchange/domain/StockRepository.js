var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":45,"methods":[{"el":19,"sc":5,"sl":13}],"name":"StockRepository","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":13}],"name":"givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":18}]},"test_1":{"methods":[{"sl":13}],"name":"givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16}]},"test_2":{"methods":[{"sl":13}],"name":"givenStockRepository_whenAskForStockInformationForAValidIdAA_thenReturnStock","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":18}]},"test_3":{"methods":[{"sl":13}],"name":"givenStockRepository_whenAskForStockInformationForAnInvalidIdZZ_thenThrowsIllagalArgumentException","pass":true,"statements":[{"sl":14},{"sl":15},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [2, 0, 1, 3], [2, 0, 1, 3], [2, 0, 1, 3], [1, 3], [], [2, 0], [], []]
