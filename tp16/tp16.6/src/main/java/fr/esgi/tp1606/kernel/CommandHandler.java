package fr.esgi.tp1606.kernel;

public interface CommandHandler<C extends Command, R> {
    R handle(C command);
}
