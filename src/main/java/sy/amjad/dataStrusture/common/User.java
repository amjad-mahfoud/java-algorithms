package sy.amjad.dataStrusture.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@AllArgsConstructor
public class User {
    @Setter @Getter
    private int id;
    @Setter @Getter
    private String name;

    @Override
    public String toString(){
        return  String.format("User[id=%d, name=%s]", id, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id && Objects.equals(name, user.name);
    }
}
