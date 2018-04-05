def calculateRevenue():
    numberOfCycles = input("the number of bikes that the shop expects to sell over the next month? ")

    costForCycle = 250;
    costForHelmets = 50;
    numberOfHelmets = int(numberOfCycles/5);
    totalCost = (numberOfHelmets*costForHelmets) + (costForCycle*numberOfCycles)

    print "the total amount of expected revenue", totalCost

calculateRevenue()
