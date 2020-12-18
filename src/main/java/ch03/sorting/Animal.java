package ch03.sorting;

public class Animal implements Comparable<Animal> {
    private int id;
    private String name;
    private Integer weight;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public Animal(int id, String name, Integer weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Animal o) {
        return id - o.id;
    }

}
