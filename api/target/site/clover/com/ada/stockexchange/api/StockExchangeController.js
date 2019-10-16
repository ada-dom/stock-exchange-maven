var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":15,"methods":[{"el":11,"sc":5,"sl":9},{"el":15,"sc":5,"sl":13}],"name":"StockExchangeController","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":9},{"sl":13}],"name":"givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO","pass":true,"statements":[{"sl":10},{"sl":14}]},"test_1":{"methods":[{"sl":9},{"sl":13}],"name":"givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned","pass":true,"statements":[{"sl":10},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [1, 0], [1, 0], [], [], [1, 0], [1, 0], [], []]
