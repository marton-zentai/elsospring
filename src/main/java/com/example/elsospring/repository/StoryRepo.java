package com.example.elsospring.repository;

import com.example.elsospring.domain.Blogger;
import com.example.elsospring.domain.Story;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StoryRepo {
    private JdbcTemplate jdbc;

    @Autowired
    public StoryRepo(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Story> findAll() {
        String sql = "SELECT * FROM story ORDER BY posted DESC";
        return jdbc.query(sql, (rs,i) -> new Story(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getString("content"),
                rs.getDate("posted"),
                rs.getLong("blogger_id")
        ));
    }

    public Story findByTitle(String title) {
        String sql = "SELECT * FROM story WHERE title = ? ORDER BY posted";
        return jdbc.queryForObject(
                sql,
                new Object[]{title},
                new RowMapper<Story>() {
                    @Override
                    public Story mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Story story = new Story();
                        story.setId(rs.getLong("id"));
                        story.setTitle(rs.getString("title"));
                        story.setContent(rs.getString("content"));
                        story.setPosted(rs.getDate("posted"));
                        story.setBlogger(new Blogger(rs.getLong("blogger_id"), "Krisz", 21));
                        return story;
                    }
                }
        );
    }
}
