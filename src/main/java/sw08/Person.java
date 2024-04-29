package sw08;

public class Person {

    private final long id;
    private String prename;
    private String name;

    public Person(final int id, String prename, String name) {
        this.id = id;
        this.prename = prename;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getPrename() {
        return prename;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id);
        sb.append("prename: ").append(prename);
        sb.append("name: ").append(name);
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.equals(obj);
    }
}
