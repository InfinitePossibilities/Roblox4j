package online.pizzacrust.master.roblox;

import java.util.List;

/**
 * Represents a user on ROBLOX.com
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface Robloxian extends Profile {

    /**
     * Represents a reference to a ROBLOX user, but details are not grabbed since it will be
     * time consuming. A light reference allows the developer to save time and grab the user when
     * he/she wants to.
     *
     * @since 1.0-SNAPSHOT
     * @author PizzaCrust
     */
    interface LightReference extends Profile {

        /**
         * Grabs the robloxian object, will take time and can return null.
         * @return
         */
        Robloxian grab();

    }

    /**
     * Converts the object to a reference, not really useful but you can do it.
     * @return
     */
    LightReference toReference();

    /**
     * Retrieves the best friends (200 max) of a player.
     * @return
     */
    List<LightReference> getBestFriends() throws Exception;

    /**
     * Retrieves the ROBLOX badges of the player.
     * @return
     */
    List<String> getRobloxBadges() throws Exception;

    /**
     * Retrieves the past usernames of the player.
     * @return
     */
    List<String> getPastUsernames() throws Exception;

    /**
     * Retrieves whether the current user in the specified group.
     * @param groupId
     * @return
     */
    boolean isInGroup(int groupId) throws Exception;

    /**
     * Retrieves the NAME of the rank of the current user in the specified group.
     * @param groupId
     * @return
     */
    String getRankInGroup(int groupId) throws Exception;

    /**
     * Retrieves profile URL
     * @return
     */
    String getProfileUrl();
}
