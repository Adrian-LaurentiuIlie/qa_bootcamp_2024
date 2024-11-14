package petStore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
        public int id;
        public String username;
        public String firstName;
        public String lastName;
        public String email;
        public String password;
        public String phone;
        public int userStatus;
}
