public class GoodStudent
{
String fristName;
String lastName;
private int ID;
private double GPA;
private boolean inCS;

public GoodStudent (String firstName, String lastName, int ID, double GPA, boolean isCS)
{
    this.fristName = firstName;
    this.lastName = lastName;
    this.ID = ID;
    this.GPA = GPA;
    this.inCS = isCS;
}

//Getters
public String getFristName()
{
    return fristName;
}
    public String getLastName()
    {
        return lastName;
    }
    public int getID()
    {
        return ID;
    }
    public double getGPA()
    {
        return GPA;
    }


public void setInCS(boolean inCS)
{
    this.inCS = inCS;
}

// Brain Method
    public double CSGPA()
    {
        return GPA * 1.15;
    }

    public String toString()
{
    String result;
    result = fristName + "," + lastName + "," + ID + "," + GPA + "," + inCS;
    return result;
}
}
