package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2
{
    public TweetListTest()
    {
        super(TweetList.class);
    }

    public void AddTweetTest()
    {
        Tweet tweet = new Tweet("Tweet");
        TweetList.addTweet(tweet);

        assertFalse(TweetList.getTweet(0)==tweet);
    }

    public void GetCountTest()
    {
        Tweet tweet = new Tweet("Tweet");
        TweetList.addTweet(tweet);
        assertFalse(TweetList.getCount()==1);
    }

    public void HasTweetTest()
    {
        Tweet tweet = new Tweet("Tweet");
        TweetList.addTweet(tweet);
        assertFalse(TweetList.hasTweet(tweet)==true);
    }
    
}
