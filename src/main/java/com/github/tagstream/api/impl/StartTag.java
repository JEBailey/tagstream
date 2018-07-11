/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.tagstream.api.impl;

import java.util.Collections;
import java.util.List;

import com.github.tagstream.api.ElementType;
import com.github.tagstream.api.Tag;

public class StartTag implements Tag {

    private String tagName;
    private List<TagAttribute> attributes = Collections.emptyList();

    public StartTag(String tag, List<TagAttribute> attrList) {
        tagName = tag;
        attributes = attrList;
    }

    public void addAttribute(TagAttribute attribute) {
        attributes.add(attribute);
    }

    @Override
    public ElementType getType() {
        return ElementType.START_TAG;
    }

    @Override
    public String getName() {
        return tagName;
    }

    @Override
    public boolean supportsAttributes() {
        return true;
    }

    @Override
    public List<TagAttribute> getAttributes() {
        return attributes;
    }
}