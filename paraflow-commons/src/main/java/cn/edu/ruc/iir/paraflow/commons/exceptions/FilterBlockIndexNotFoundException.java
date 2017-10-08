/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.edu.ruc.iir.paraflow.commons.exceptions;

import cn.edu.ruc.iir.paraflow.commons.proto.StatusProto;

/**
 * @author jelly.guodong.jin@gmail.com
 */
public class FilterBlockIndexNotFoundException extends ParaFlowException
{
    private static final long serialVersionUID = -9146284569119763113L;

    /**
     * get error message.
     *
     * @return error message
     */
    @Override
    public String getMessage()
    {
        return "filter block index not found exception";
    }

    @Override
    public StatusProto.ResponseStatus getResponseStatus()
    {
        return StatusProto.ResponseStatus
                .newBuilder()
                .setStatus(StatusProto.ResponseStatus.State.FILTER_BLOCK_INDEX_NOT_FOUND_WARN)
                .build();
    }

    /**
     * get system hint message for user on how to deal with this exception
     *
     * @return hint message
     */
    @Override
    public String getHint()
    {
        return "Check and try again";
    }

    /**
     * get exception level
     *
     * @return exception level
     */
    @Override
    public ParaFlowExceptionLevel getLevel()
    {
        return ParaFlowExceptionLevel.WARN;
    }
}
