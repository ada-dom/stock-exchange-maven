var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":0,"methods":[{"el":24,"sc":5,"sl":15},{"el":29,"sc":5,"sl":26}],"name":"StockService","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":15},{"sl":26}],"name":"givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":23},{"sl":27},{"sl":28}]},"test_1":{"methods":[{"sl":15},{"sl":26}],"name":"givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":20},{"sl":21},{"sl":23},{"sl":27},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [0, 1], [0, 1], [0, 1], [0, 1], [], [1], [1], [], [0, 1], [], [], [0, 1], [0, 1], [0, 1], [], [], []]
