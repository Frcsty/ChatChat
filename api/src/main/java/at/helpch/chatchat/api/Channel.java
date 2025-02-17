package at.helpch.chatchat.api;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Set;

public interface Channel {

    @NotNull String name();

    @NotNull String messagePrefix();

    @NotNull String channelPrefix();

    @NotNull List<String> commandNames();

    int radius();

    Set<User> targets(@NotNull final User source);

    boolean isUsableBy(@NotNull final ChatUser user);
}
