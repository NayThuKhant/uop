class CostCalculationException extends Exception{}
class Item {
       public void calculateCost() throws CostCalculationException {
                //...
                throw new CostCalculationException();
                //...
       }
}
class Company {
        public void payCost() throws CostCalculationException{
                new Item().calculateCost();
      }
}

