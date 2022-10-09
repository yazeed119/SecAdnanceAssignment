import com.company.Behavior;
import com.company.PlayerCharacter;

public class MonsterBehavior implements Behavior {

    private PlayerCharacter playercharacter;


    public MonsterBehavior(PlayerCharacter e){
        playercharacter = e;
    }

    @Override
    public void render() {

    }

    @Override
    public void makeNoise() {

    }
}
