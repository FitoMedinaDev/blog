package mdeis.module1.blog.usecase.tag;

import org.springframework.stereotype.Component;

@Component
public class TagUseCase {
    public final CreateTag createTag;
    public final GetTagById getTagById;
    public final UpdateTag updateTag;
    public final DeleteTag deleteTag;
    public final GetAllTags getAllTags;

    public TagUseCase(CreateTag createTag, GetTagById getTagById, UpdateTag updateTag, DeleteTag deleteTag, GetAllTags getAllTags) {
        this.createTag = createTag;
        this.getTagById = getTagById;
        this.updateTag = updateTag;
        this.deleteTag = deleteTag;
        this.getAllTags = getAllTags;
    }
}
