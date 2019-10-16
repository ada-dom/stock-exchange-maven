var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":50,"id":52,"methods":[{"el":19,"sc":5,"sl":12},{"el":28,"sc":5,"sl":21},{"el":39,"sc":5,"sl":30},{"el":49,"sc":5,"sl":41}],"name":"StockTest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2":{"methods":[{"sl":30}],"name":"givenStockRepository_whenAskForStockInformationForAValidIdAA_thenReturnStock","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":37},{"sl":38}]},"test_3":{"methods":[{"sl":41}],"name":"givenStockRepository_whenAskForStockInformationForAnInvalidIdZZ_thenThrowsIllagalArgumentException","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47}]},"test_4":{"methods":[{"sl":12}],"name":"givenStockWithNoPrice_whenAskingForCurrency_thenTheDefaultEuroIsReturned","pass":true,"statements":[{"sl":16},{"sl":18}]},"test_5":{"methods":[{"sl":21}],"name":"givenStockWithNoPrice_whenAskingForPrice_thenZeroIsReturned","pass":true,"statements":[{"sl":25},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [4], [], [], [], [4], [], [4], [], [], [5], [], [], [], [5], [], [5], [], [], [2], [], [], [], [2], [2], [], [2], [2], [], [], [3], [], [], [], [3], [3], [3], [], [], []]
