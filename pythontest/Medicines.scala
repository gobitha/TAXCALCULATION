class Medicines
 {
  private var qunatity: Int = 0;
  private var amount:  Int =0;
  private var name: String = " ";
  private var city: String = " "
  private var disease: String = " ";
  private var medicine: String = " ";
  
  def setQuantity(qunatity: Int):Unit = {
  this.qunatity = qunatity;
  }
   def setAmount(amount: Int):Unit = {
  this.amount = amount;
  }
   def setName(name: String):Unit = {
  this.name = name;
  }
   def setCity(city: String):Unit = {
  this.city = city;
  }
   def setDisease(disease: String):Unit = {
  this.disease = disease;
  }
   def setMedicine(medicine: String):Unit = {
  this.medicine = medicine;
  }
  
  def totalamount() : Int = {
  return qunatity * amount;
  }
  
 }
 
