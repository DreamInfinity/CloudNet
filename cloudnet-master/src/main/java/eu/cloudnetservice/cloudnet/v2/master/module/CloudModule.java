package eu.cloudnetservice.cloudnet.v2.master.module;

import eu.cloudnetservice.cloudnet.v2.command.Command;
import eu.cloudnetservice.cloudnet.v2.event.Event;
import eu.cloudnetservice.cloudnet.v2.event.EventKey;
import eu.cloudnetservice.cloudnet.v2.event.EventListener;
import eu.cloudnetservice.cloudnet.v2.master.CloudNet;
import eu.cloudnetservice.cloudnet.v2.master.module.model.CloudModuleDescriptionFile;

import java.nio.file.Path;

public interface CloudModule {

    void onLoad();

    void onEnable();

    void onDisable();

    CloudModuleDescriptionFile getModuleJson();

    Path getDataFolder();

    CloudNet getCloud();

    CloudModuleLogger getModuleLogger();

    boolean isEnabled();

    /**
     * Registered a IEventListener objective to a Event Class
     *
     * @param eventListener
     * @param <T>
     */
    public <T extends Event> void registerListener(EventListener<T> eventListener);

    /**
     * Registered a command
     *
     * @param command
     */
    public void registerCommand(Command command);
}
