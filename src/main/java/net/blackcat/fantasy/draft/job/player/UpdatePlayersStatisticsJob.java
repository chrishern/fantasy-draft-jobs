/**
 * 
 */
package net.blackcat.fantasy.draft.job.player;

import java.util.Date;

import net.blackcat.fantasy.draft.fpl.integration.facade.PlayerDataFacade;
import net.blackcat.fantasy.draft.integration.exception.FantasyDraftIntegrationException;
import net.blackcat.fantasy.draft.job.spring.ApplicationContextProvider;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * Job which runs to update the statistics of players within the game.
 * 
 * @author Chris
 *
 */
@Component
public class UpdatePlayersStatisticsJob implements Job {

	@Override
    public void execute(final JobExecutionContext ctx) throws JobExecutionException {

        System.out.println(new Date().toString() + " - Executing Update Players Statistics Job");
        
        try {
			ApplicationContextProvider.getApplicationContext().getBean(PlayerDataFacade.class).updateExistingPlayerStatistics();
		} catch (final FantasyDraftIntegrationException e) {
			System.out.println("Error when executing Update Players Statistics Job " + e);
		}
        
        System.out.println(new Date().toString() + " - Finished Executing Update Players Statistics Job");

    }
}
