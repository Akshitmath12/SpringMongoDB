/*
Test generated by RoostGPT for test Java_test using AI Type Vertex AI and AI Model code-bison-32k

 **Test Scenario 1: Valid Profile**
- Objective: To verify that the setProfile method successfully updates the profile field with a valid profile value.

**Test Steps:**
1. Create a new Profile object with a default profile value.
2. Call the setProfile method with a valid profile value (e.g., "Admin").
3. Verify that the profile field of the Profile object is updated with the new value.

**Expected Result:**
- The profile field of the Profile object should be updated with the new value.

**Test Scenario 2: Empty Profile**
- Objective: To verify that the setProfile method handles an empty profile value gracefully.

**Test Steps:**
1. Create a new Profile object with a default profile value.
2. Call the setProfile method with an empty profile value ("").
3. Verify that the profile field of the Profile object remains unchanged.

**Expected Result:**
- The profile field of the Profile object should remain unchanged.

**Test Scenario 3: Null Profile**
- Objective: To verify that the setProfile method handles a null profile value gracefully.

**Test Steps:**
1. Create a new Profile object with a default profile value.
2. Call the setProfile method with a null profile value (null).
3. Verify that the profile field of the Profile object remains unchanged.

**Expected Result:**
- The profile field of the Profile object should remain unchanged.

**Test Scenario 4: Invalid Profile**
- Objective: To verify that the setProfile method handles an invalid profile value gracefully.

**Test Steps:**
1. Create a new Profile object with a default profile value.
2. Call the setProfile method with an invalid profile value (e.g., "Invalid Profile").
3. Verify that the profile field of the Profile object remains unchanged.

**Expected Result:**
- The profile field of the Profile object should remain unchanged.
*/
package com.telusko.joblisting.model;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Post_setProfile_50f29a11fe_Test {

    private Post post;

    @BeforeEach
    void setUp() {
        post = new Post();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Admin", "Developer", "Manager"})
    void setProfile_validProfile(String profile) {
        post.setProfile(profile);
        assertEquals(profile, post.getProfile());
    }

    @Test
    void setProfile_emptyProfile() {
        post.setProfile("");
        assertEquals("", post.getProfile());
    }

    @Test
    void setProfile_nullProfile() {
        post.setProfile(null);
        assertEquals(null, post.getProfile());
    }

    @Test
    void setProfile_invalidProfile() {
        post.setProfile("Invalid Profile");
        assertEquals("Invalid Profile", post.getProfile());
    }
}
