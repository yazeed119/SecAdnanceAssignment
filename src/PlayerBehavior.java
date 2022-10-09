import com.company.Behavior;
import com.company.PlayerCharacter;

public class PlayerBehavior implements Behavior {
    private PlayerCharacter playercharacter;


    public PlayerBehavior(PlayerCharacter e){
        playercharacter = e;
    }


    @Override
    public void render() {
        // TODO!
    }

    /**
     * Make a noise - will probably remain empty.
     */
    @Override
    public void makeNoise() {

    }
}
