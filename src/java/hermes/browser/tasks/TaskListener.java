/* 
 * Copyright 2003,2004 Colin Crist
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package hermes.browser.tasks;


/**
 * @author colincrist@hermesjms.com
 * @version $Id: TaskListener.java,v 1.1 2004/11/17 17:24:06 colincrist Exp $
 */

public interface TaskListener
{
    public void onStarted(Task task) ;
    
    public void onStopped(Task task) ;
    
    public void onStatus(Task task, String status) ;
    
    public void onThrowable(Task task, Throwable t) ;
}
