var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":0,"methods":[{"el":20,"sc":5,"sl":15},{"el":24,"sc":5,"sl":22},{"el":28,"sc":5,"sl":26},{"el":32,"sc":5,"sl":30},{"el":36,"sc":5,"sl":34},{"el":44,"sc":5,"sl":38}],"name":"StockDto","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":15},{"sl":22},{"sl":26},{"sl":34}],"name":"givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":23},{"sl":27},{"sl":35}]},"test_1":{"methods":[{"sl":15},{"sl":22},{"sl":26},{"sl":34}],"name":"givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19},{"sl":23},{"sl":27},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1, 0], [1, 0], [1, 0], [1, 0], [1, 0], [], [], [1, 0], [1, 0], [], [], [1, 0], [1, 0], [], [], [], [], [], [], [1, 0], [1, 0], [], [], [], [], [], [], [], [], [], []]
