package net.kettlemc.kproxy;

import net.kettlemc.kproxy.loading.Loadable;
import static net.kettlemc.kproxy.util.PluginConstants.*;
import com.velocitypowered.api.plugin.Plugin;

public class PluginLoader {

    Loadable plugin;

    @Override
    public void onLoad() {
        this.plugin = new Plugin(this);
        plugin.onLoad();
    }

    @Override
    public void onEnable() {
        plugin.onEnable();
    }

    @Override
    public void onDisable() {
        plugin.onDisable();
    }


}
