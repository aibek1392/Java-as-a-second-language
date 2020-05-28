package inventory.electric;

public interface Chargeable{
    
  String getPlugType();
  void setPlugType(String plugType);

  Integer getBatteryCap();
  void setBatteryCap();

}