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
 * @author Chris
 *
 */
@Component
public class UpdatePlayersCurrentPriceJob implements Job {

	@Override
    public void execute(final JobExecutionContext ctx) throws JobExecutionException {

        System.out.println(new Date().toString() + " - Executing Update Players Price Data Job");
        
        try {
			ApplicationContextProvider.getApplicationContext().getBean(PlayerDataFacade.class).updateExistingPlayerPriceData();
		} catch (final FantasyDraftIntegrationException e) {
			System.out.println("Error when executing Update Players Price Data Job " + e);
		}
        
        System.out.println(new Date().toString() + " - Finished Executing Update Players Price Data Job");

    }
}
