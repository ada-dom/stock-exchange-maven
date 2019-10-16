var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":17,"methods":[{"el":14,"sc":5,"sl":11},{"el":18,"sc":5,"sl":16}],"name":"StockCurrency","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":11},{"sl":16}],"name":"givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":17}]},"test_3":{"methods":[{"sl":11},{"sl":16}],"name":"givenStockWithNoPrice_whenAskingForCurrency_thenTheDefaultEuroIsReturned","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":17}]},"test_4":{"methods":[{"sl":16}],"name":"givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned","pass":true,"statements":[{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3, 2], [3, 2], [3, 2], [], [], [3, 2, 4], [3, 2, 4], [], []]
