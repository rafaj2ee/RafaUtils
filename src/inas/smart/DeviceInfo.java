/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inas.smart;

/**
 * SMART 프린터의 이름과 Open된 handle 값을 가지고 있는 클래스이다.
 * @author inasystem
 */
public class DeviceInfo {
    /**
     * device handle information got by jSmartComm_opendevice();
     */
    public int handle;
    /**00
     * device name
     */
    public String ID;

    public void Init() {
        this.handle = -1;
        this.ID = null;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getHandle() {
        return handle;
    }

    public void setHandle(int handle) {
        this.handle = handle;
    }

    public boolean IsOpen() {
        if ( handle < 0 )
            return false;
        else
           return true;
    }

    public int Close() {
        this.ID = null;
        this.handle = -1;
        return 0;
    }
}
