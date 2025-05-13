package com.xfhuang.playground.note.biz.constant;


public interface MQConstants {

    
    String TOPIC_DELETE_NOTE_LOCAL_CACHE = "DeleteNoteLocalCacheTopic";

    
    String TOPIC_DELAY_DELETE_NOTE_REDIS_CACHE = "DelayDeleteNoteRedisCacheTopic";

    
    String TOPIC_PUBLISH_NOTE_TRANSACTION = "PublishNoteTransactionTopic";

    
    String TOPIC_DELAY_DELETE_PUBLISHED_NOTE_LIST_REDIS_CACHE = "DelayDeletePublishedNoteListRedisCacheTopic";

    
    String TOPIC_LIKE_OR_UNLIKE = "LikeUnlikeTopic";

    
    String TOPIC_NOTE_OPERATE = "NoteOperateTopic";

    
    String TOPIC_COLLECT_OR_UN_COLLECT = "CollectUnCollectTopic";

    
    String TOPIC_COUNT_NOTE_LIKE = "CountNoteLikeTopic";

    
    String TOPIC_COUNT_NOTE_COLLECT = "CountNoteCollectTopic";

    
    String TAG_LIKE = "Like";

    
    String TAG_UNLIKE = "Unlike";

    
    String TAG_COLLECT = "Collect";

    
    String TAG_UN_COLLECT = "UnCollect";

    
    String TAG_NOTE_PUBLISH = "publishNote";

    
    String TAG_NOTE_DELETE = "deleteNote";
}
