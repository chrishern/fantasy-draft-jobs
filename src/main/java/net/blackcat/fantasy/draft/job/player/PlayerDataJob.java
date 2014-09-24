/**
 * 
 */
package net.blackcat.fantasy.draft.job.player;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Chris
 *
 */
public class PlayerDataJob implements Job {

	@Override
    public void execute(final JobExecutionContext ctx) throws JobExecutionException {

        System.out.println("Executing Job");

    }

}
