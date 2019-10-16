var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":22,"methods":[{"el":13,"sc":5,"sl":10},{"el":17,"sc":5,"sl":15},{"el":21,"sc":5,"sl":19}],"name":"StockPrice","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":10},{"sl":15},{"sl":19}],"name":"givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":16},{"sl":20}]},"test_4":{"methods":[{"sl":10},{"sl":15},{"sl":19}],"name":"givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":16},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [2, 4], [2, 4], [2, 4], [], [], [2, 4], [2, 4], [], [], [2, 4], [2, 4], [], []]
