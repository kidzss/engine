// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.embedding.engine.dart;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * WARNING: THIS CLASS IS EXPERIMENTAL. DO NOT SHIP A DEPENDENCY ON THIS CODE.
 * IF YOU USE IT, WE WILL BREAK YOU.
 */
public interface PlatformMessageHandler {
  void handleMessageFromDart(@NonNull final String channel, @Nullable byte[] message, final int replyId);

  void handlePlatformMessageResponse(int replyId, @Nullable byte[] reply);
}
