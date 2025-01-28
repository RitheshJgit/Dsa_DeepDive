package OOPS.Family;

public class Parent extends GrandParent{
    String Father = "KaliyaMoorthi";
    String name = "Jayapal";

    Parent(){
        super();
        System.out.println("Iam Jayapal (Parent Class)" + "\nSon of "+super.name);
    }
}
