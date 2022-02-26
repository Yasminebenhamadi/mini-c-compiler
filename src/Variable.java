class Variable {
    private String type;
    private String name;

    public Variable(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Variable variable = (Variable) object;
        return this.name.equals(variable.getName());
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), name);
    }
}