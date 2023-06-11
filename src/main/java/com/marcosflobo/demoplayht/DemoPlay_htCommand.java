package com.marcosflobo.demoplayht;

import io.micronaut.configuration.picocli.PicocliRunner;

import jakarta.inject.Inject;
import java.time.Duration;
import java.time.Instant;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command(name = "demo-play_ht", description = "...",
        mixinStandardHelpOptions = true)
public class DemoPlay_htCommand implements Runnable {

    @Inject
    public PathHtService pathHtService;

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public DemoPlay_htCommand(){

    }

    public DemoPlay_htCommand(PathHtService pathHtService) {
        this.pathHtService = pathHtService;
    }

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DemoPlay_htCommand.class, args);
    }

    public void run() {
        // business logic here
        if (verbose) {
            System.out.println("Hi!");
        }

        System.out.println("Running!");
        Instant one = Instant.now();
        pathHtService.get();
        Duration later = Duration.between(one, Instant.now());
        System.out.println("end!");
        System.out.println("It took '" + later.toSeconds() + "' seconds to answer");
    }
}
