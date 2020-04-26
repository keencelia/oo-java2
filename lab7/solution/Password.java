package mini.java.basic.arrays2;

import java.util.Objects;

public abstract class Password implements Nameable {

    protected String name;
    protected Object password;

    public Password() {
        this.name = null;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public String toString() {
        String out = this.getClass().getSimpleName() + "{" + "password=" + "****" + ", " + "name='" +
                this.name + "'}";
        return out;
    }

    /**
     *
     * @param o
     * @return
     */
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || (this.getClass() != o.getClass())) return false;

        if (!(o instanceof Password)) return false;

        Password p = (Password)o;

        if (!Objects.equals(this.name, p.getName())) return false;

        return Objects.deepEquals(this.password, p.password);
    }

    /**
     *
     * @param password
     * @return
     */
    abstract public boolean check(Object password);


    /**
     * check in base class is also possible, but we're testing abstract methods
     * @param password
     * @return
     */
    public boolean check(Object password, boolean inbaseclass) {
        return Objects.deepEquals(this.password, password);
    }


}
