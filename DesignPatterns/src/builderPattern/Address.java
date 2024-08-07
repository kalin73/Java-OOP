package builderPattern;

public class Address {
    private String name;
    private String email;
    private String country;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private final Address address;

        private Builder() {
            this.address = new Address();
        }

        public Builder setName(String name) {
            address.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            address.email = email;
            return this;
        }

        public Builder setCountry(String country) {
            address.country = country;
            return this;
        }

        public Address build() {
            validate();
            return address;
        }

        private void validate() {
            StringBuilder exceptionMessage = new StringBuilder();

            if (address.name != null && address.name.isEmpty()) {
                exceptionMessage.append("Empty name!\n");
            }
            if (address.email != null && address.email.isEmpty()) {
                exceptionMessage.append("Empty email!\n");
            }
            if (address.country != null && address.country.isEmpty()) {
                exceptionMessage.append("Empty country!\n");
            }

            if (exceptionMessage.length() > 1) {
                throw new IllegalArgumentException(exceptionMessage.toString());
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCountry() {
        return country;
    }

}
