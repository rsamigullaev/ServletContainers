package org.rus.jspr04.post;

import org.rus.jspr04.post.model.Post;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * STUB
 */
public final class PostRepository {
    public List<Post> all() {
        return Collections.emptyList();
    }

    public Optional<Post> getById(long id) {
        return Optional.empty();
    }

    public Post save(Post post) {
        return post;
    }

    public void removeById(long id) {
    }
}