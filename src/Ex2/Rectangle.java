package Ex2;


public class Rectangle {
    double width = 10.0;
    double height = 10.0;

    public double getArea() { //не нужно передавать данные. Метод сам возьмёт их у обьекта
        //System.out.println(a*b); Метод не должен ничего печатать, он просто возвращает значение площади.
        return this.width*this.height;
    }
}
