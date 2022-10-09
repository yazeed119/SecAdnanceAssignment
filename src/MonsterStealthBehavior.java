import com.company.Behavior;
import com.company.PlayerCharacter;

public class MonsterStealthBehavior implements Behavior {

    private PlayerCharacter playercharacter;


    public MonsterStealthBehavior(PlayerCharacter e){
        playercharacter = e;
    }

    @Override
    public void render() {

    }

    @Override
    public void makeNoise() {

    }
}
