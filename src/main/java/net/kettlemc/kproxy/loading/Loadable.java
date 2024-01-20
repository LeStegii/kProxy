package net.kettlemc.kproxy.loading;

public interface Loadable {

    default void onLoad() {
    }

    default void onEnable() {
    }

    default void onDisable() {
    }
}
