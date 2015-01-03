package org.frc3620.timeclock.gui;

/**
 *
 * @author wegscd
 */
public interface FormEventListener {
   public void personSelected (Integer i);
   public void checkin (Integer i);
   public void checkout (Integer i);
   public void editWorksession (Integer personIndex, Integer worksessionIndex);
   public void mentorMode (Integer personIndex);
}
