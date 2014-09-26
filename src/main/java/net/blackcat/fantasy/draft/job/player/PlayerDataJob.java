/**
 * 
 */
package net.blackcat.fantasy.draft.job.player;

import java.util.Date;

import net.blackcat.fantasy.draft.fpl.integration.facade.PlayerDataFacade;
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
public class PlayerDataJob implements Job{

	@Override
    public void execute(final JobExecutionContext ctx) throws JobExecutionException {

        System.out.println(new Date().toString() + " - Executing Update Players Current Price Job");
        
        ApplicationContextProvider.getApplicationContext().getBean(PlayerDataFacade.class).updatePlayersCurrentPrice();
        
        System.out.println(new Date().toString() + " - Finished Executing Update Players Current Price Job");

    }
}
