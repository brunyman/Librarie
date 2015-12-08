package base;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Test extends JavaPlugin {
	
	public static Logger log;

	@Override
    public void onEnable() {
		log = getLogger();
		
		
		
		log.info("Test has been successfully loaded!");
	}
	
	@Override
    public void onDisable() {
		log.info("Test has been disabled");
	}
	
	
	
}
