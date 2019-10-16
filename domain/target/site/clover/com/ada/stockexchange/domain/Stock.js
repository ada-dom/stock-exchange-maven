var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":0,"methods":[{"el":14,"sc":5,"sl":11},{"el":18,"sc":5,"sl":16},{"el":22,"sc":5,"sl":20},{"el":26,"sc":5,"sl":24},{"el":30,"sc":5,"sl":28},{"el":34,"sc":5,"sl":32}],"name":"Stock","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":11},{"sl":20},{"sl":24}],"name":"givenStockRepository_whenAskForStockInformationForAValidIdAA_thenReturnStock","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":21},{"sl":25}]},"test_2":{"methods":[{"sl":11},{"sl":16},{"sl":20},{"sl":24},{"sl":28},{"sl":32}],"name":"givenADatabase_whenStoclExchangeControllerAskForUnknownId_theReturnAnUknownDTO","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":17},{"sl":21},{"sl":25},{"sl":29},{"sl":33}]},"test_3":{"methods":[{"sl":11},{"sl":32}],"name":"givenStockWithNoPrice_whenAskingForCurrency_thenTheDefaultEuroIsReturned","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":33}]},"test_4":{"methods":[{"sl":16},{"sl":20},{"sl":24},{"sl":28},{"sl":32}],"name":"givenADatabase_whenStockExchangeControllerAskForIdAA_thenStockDTOContainingIsReturned","pass":true,"statements":[{"sl":17},{"sl":21},{"sl":25},{"sl":29},{"sl":33}]},"test_5":{"methods":[{"sl":11},{"sl":28}],"name":"givenStockWithNoPrice_whenAskingForPrice_thenZeroIsReturned","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [5, 3, 0, 2], [5, 3, 0, 2], [5, 3, 0, 2], [], [], [2, 4], [2, 4], [], [], [0, 2, 4], [0, 2, 4], [], [], [0, 2, 4], [0, 2, 4], [], [], [5, 2, 4], [5, 2, 4], [], [], [3, 2, 4], [3, 2, 4], [], []]
