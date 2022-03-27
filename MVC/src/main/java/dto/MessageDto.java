package dto;

import java.util.List;

public class MessageDto {
    private final Long id;
    private final UserDto sender;
    private final UserDto recipient;
    private final String content;
    private final List<UserDto> UsersLikes;
    private final boolean isAlreadyRead;


    private MessageDto(Long id, UserDto sender, UserDto recipient, String content, List<UserDto> usersLikes, boolean isAlreadyRead) {
        this.id = id;
        this.sender = sender;
        this.recipient = recipient;
        this.content = content;
        UsersLikes = usersLikes;
        this.isAlreadyRead = isAlreadyRead;
    }

    public Long getId() {
        return id;
    }

    public UserDto getSender() {
        return sender;
    }

    public UserDto getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    public List<UserDto> getUsersLikes() {
        return UsersLikes;
    }

    public Boolean isAlreadyRead() {
        return isAlreadyRead;
    }

    @Override
    public String toString() {
        return "MessageDto{" +
                "id=" + id +
                ", sender=" + sender +
                ", recipient=" + recipient +
                ", content='" + content + '\'' +
                ", UsersLikes=" + UsersLikes +
                ", isAlreadyRead=" + isAlreadyRead +
                '}';
    }

    public static class Builder {
        private Long id;
        private UserDto sender;
        private UserDto recipient;
        private String content;
        private List<UserDto> usersLikes;
        private boolean isAlreadyRead;

        public Builder() {
        }

        public static Builder createBuilder() {
            return new Builder();
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withSender(UserDto sender) {
            this.sender = sender;
            return this;
        }

        public Builder withRecipient(UserDto recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder withContent(String content) {
            this.content = content;
            return this;
        }

        public Builder withUserLikes(List<UserDto> usersLikes) {
            this.usersLikes = usersLikes;
            return this;
        }

        public Builder isAlreadyRead(boolean isAlreadyRead) {
            this.isAlreadyRead = isAlreadyRead;
            return this;
        }

        public MessageDto build() {
            return new MessageDto(id, sender, recipient, content, usersLikes, isAlreadyRead);
        }
    }


}
