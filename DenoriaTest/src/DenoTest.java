import org.bukkit.plugin.java.JavaPlugin;

public class DenoTest extends JavaPlugin {

    public static DenoTest instance;

    @Override
    public void onEnable() {
        instance = this;
        super.onEnable();
    }

    @Override
    public void onDisable() {
        // TODO Auto-generated method stub
        super.onDisable();
    }

    public static DenoTest getInstance() {
        return instance;
    }


}
