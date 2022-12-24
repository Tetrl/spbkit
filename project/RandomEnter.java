package tudrifcastles.plugins;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;


public final class RandomEnter extends JavaPlugin implements @NotNull Listener {
    int random = 100000 + (int) (Math.random() * 999999); //рандомное число
    int eff = 1;
    int on = 0;
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("run").setExecutor(new CommandExecutor() {//обявление команды

            @Override
            public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
                if(args[0].equalsIgnoreCase(String.valueOf(random))){ //сверяем число с ответом
                    sender.sendMessage(ChatColor.GREEN + "Вы успешно прошли проверку!");
                    on = on+1;
                    return true;
                } else if (eff == 1) {
                    sender.sendMessage(ChatColor.RED + "Попробуйте еще раз. Осталось 2-е попытки.");
                    eff = eff+1;
                } else if (eff == 2) {
                    sender.sendMessage(ChatColor.DARK_RED + "Попробуйте еще раз. Осталась 1-а попытка.");
                    eff = eff+1;
                }
                return false;
            }
        });
    }
    public void PlayerEvent(@NotNull Player who){
        Player h = who.getPlayer();
        if(on == 1) {
        h.setGameMode(GameMode.SURVIVAL);} // обычный режим выживания
    }

    @EventHandler(priority=EventPriority.NORMAL)
    public void onJoin(@NotNull PlayerJoinEvent event){
        Player p = event.getPlayer();
        p.sendMessage(ChatColor.RED + "Добро пожаловать " + p.getName() + ".");
        p.sendMessage(ChatColor.DARK_GREEN + "Введите данное число в чат, с помощью /run ...");
        p.sendMessage(ChatColor.GREEN + String.valueOf(random));
        p.setGameMode(GameMode.SPECTATOR); //режим наблюдатели
        getLogger().info("Игрок зашёл");
    }
}