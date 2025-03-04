package org.springblade.websocket.model;

import lombok.Data;

/**
 * ChatMessage
 *
 * @author rajeevkumarsingh
 */
@Data
public class ChatMessage {

	public enum MessageType {
		/**
		 * 聊天
		 */
		CHAT,
		/**
		 * 加入
		 */
		JOIN,
		/**
		 * 离开
		 */
		LEAVE
	}

	private MessageType type;
	private String content;
	private String sender;

}
